using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using Question1.Models;
using Question1.DAL;

namespace Question1.Controllers
{
    public class HomeController : Controller
    {
        public ActionResult Index()
        {
            List<Presenter> list = DataManagar.getData();
            this.ViewBag.list = list;
            return View();
        }
        [HttpGet]
        public ActionResult Data(int Id)
        {
            List<Presenter> list = DataManagar.getData();
            Presenter model = list.Find((e) => (e.Id == Id));
            return View(model);
        }
    }
}