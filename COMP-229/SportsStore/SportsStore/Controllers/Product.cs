using Microsoft.AspNetCore.Mvc;

namespace SportsStore.Controllers
{
  public class Product : Controller
  {
    // GET
    public IActionResult Index()
    {
      return View();
    }
  }
}