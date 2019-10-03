using System.Linq;
using Microsoft.AspNetCore.Mvc;
using SportsStore.Models;
using SportsStore.Models.ViewModels;
using SportsStore.Infrastructure;

namespace SportsStore.Controllers
{
  public class ProductController : Controller
  {
    private IProductRepository _repository;
    public int pageSize = 4;
    
    public ProductController(IProductRepository repository)
    {
      _repository = repository;
    }

    //public ViewResult List() => View(_repository.Products);

    public ViewResult List(string category, int productPage = 1) =>
      View(new ProductListViewModel
      {
        Products = _repository.Products
          .Where(p => category == null || p.Category == category)
          .OrderBy(p => p.ProductID)
          .Skip((productPage - 1) * pageSize)
          .Take(pageSize),
        PagingInfo = new PagingInfo
        {
          CurrentPage = productPage,
          ItemsPerPage = pageSize,
          TotalItems = _repository.Products.Count()
        }
      });
  }
}