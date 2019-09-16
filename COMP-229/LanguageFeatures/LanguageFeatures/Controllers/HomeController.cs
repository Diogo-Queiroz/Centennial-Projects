using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using LanguageFeatures.Models;

namespace LanguageFeatures.Controllers
{
    public class HomeController : Controller
    {
        public ViewResult Index()
        {
            return View(new string[] { "C#", "Language", "Features"});
        }

        public ViewResult Index2()
        {
            List<string> results = new List<string>();
            foreach (Product p in Product.GetProducts())
            {
                string name = p?.Name;
                decimal? price = p?.Price;
                results.Add(string.Format("Name {0}, Price: {1}", name, price));
            }
            return View("Index", results);
        }

        public ViewResult Index3()
        {
            List<string> results = new List<string>();
            foreach (Product p in Product.GetProducts())
            {
                string name = p?.Name;
                decimal? price = p?.Price;
                string related = p?.Related?.Name;
                results.Add(string.Format("Name {0}, Price: {1}, Related: {2}", name, price, related));
            }
            return View("Index", results);
        }

        public ViewResult Index4()
        {
            List<string> results = new List<string>();
            foreach (Product p in Product.GetProducts())
            {
                string name = p?.Name ?? "<No Name>";
                decimal? price = p?.Price ?? 0;
                string related = p?.Related?.Name ?? "<NONE>";
                results.Add(string.Format("Name {0}, Price: {1}, Related: {2}", name, price, related));
            }
            return View("Index", results);
        }

        public ViewResult Index5()
        {
            ShoppingCart cart = new ShoppingCart { Products = Product.GetProducts() };
            decimal cartPortal = cart.TotalPrices();
            return View("Index", new string[] { $"Total: {cartPortal:C2}" });
        }
    }
}