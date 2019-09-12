using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using PartyEnvites.Models;

namespace PartyEnvites.Controllers
{
    public class HomeController : Controller
    {
        public ViewResult Index()
        {
            ViewBag.Greeting = "Humans";
            return View("MyView");
        }

        [HttpGet]
        public ViewResult RsvpForm()
        {
            return View();
        }
        [HttpPost]
        public ViewResult RsvpForm(GuestReponse guestResponse)
        {
            Repository.AddReponse(guestResponse);
            return View("Thanks", guestResponse);
        }

        public ViewResult ListResponse()
        {
            return View(Repository.Reponses.Where(r => r.WillAttend == true));
        }
    }
}