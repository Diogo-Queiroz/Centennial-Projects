using Microsoft.AspNetCore.Mvc;
using Razor.Models;

namespace Razor.Controllers
{
  public class HomeController : Controller
  {
    // GET
    public ViewResult Index()
    {
      /*Product product = new Product
      {
        ProductID = 1,
        Name = "Kayak",
        Category = "Watersports",
        Descriptions = "A bot for one",
        Price = 275M
      };*/
      
      Product[] array =
      {
        new Product
        {
          Name = "Kayak", Price = 275M
        },
        new Product 
        {
          Name = "LifeJacket", Price = 48.95M
        },
        new Product
        {
          Name = "Fairweather", Price = 19.25M
        },
        new Product
        {
          Name = "Waifaur", Price = 2.02M
        }
      };

      ViewBag.StockLevel = 2;
      return View(array);
    }
  }
}