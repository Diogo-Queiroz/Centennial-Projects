using System;
using System.Linq;
using Microsoft.AspNetCore.Mvc;
using RecipesLab2.Models;

namespace RecipesLab2.Controllers
{
  public class HomeController : Controller
  {
    public ViewResult Index()
    {
      int hour = DateTime.Now.Hour;
      ViewBag.Greetings = hour < 12 ? "Morning" : "Afternoon";
      return View();
    }
    
    public ViewResult Data()
    {
      return View(Repository.Recipes);
    }

    [HttpGet]
    public ViewResult Display(int id)
    {
      Recipe recipe = Repository.Recipes.Where(n => n.RecipeID == id).FirstOrDefault();
      return View(recipe);
    }

    [HttpGet]
    public ViewResult Insert()
    {
      return View();
    }

    [HttpPost]
    public ViewResult Insert(Recipe recipe)
    {
      if (ModelState.IsValid)
      {
        int tempID;
        if (Repository.Recipes.Count() == 0)
        {
          tempID = 1;
        }
        else
        {
          tempID = Repository.Recipes.Count() + 1;
        }
        recipe.RecipeID = tempID;
        Repository.AddRecipe(recipe);
        return View("Success", recipe);
      } 
      else
      {
        return View();
      }
    }

    public ViewResult User()
    {
      return View();
    }

    [HttpGet]
    public ViewResult RsvpForm()
    {
      return View();
    }

    [HttpPost]
    public ViewResult RsvpForm(GuestReponse guestReponse)
    {
      return View();
    }
  }
}