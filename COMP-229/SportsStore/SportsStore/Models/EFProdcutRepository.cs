using System.Linq;

namespace SportsStore.Models
{
  public class EFProdcutRepository : IProductRepository
  {
    private ApplicationDbContext _context;
    private IProductRepository _productRepositoryImplementation;

    public EFProdcutRepository(ApplicationDbContext context)
    {
      _context = context;
    }

    public IQueryable<Product> Products
    {
      get => _context.Products;
      set => _context.Products = null;
    }
  }
}