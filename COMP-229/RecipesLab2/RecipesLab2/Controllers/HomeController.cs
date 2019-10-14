using System;
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
      return View();
    }

    public ViewResult Display()
    {
      return View();
    }

    public ViewResult Insert()
    {
      return View();
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