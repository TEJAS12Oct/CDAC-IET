using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using Question1.Models;
using Question1.DAL;

namespace Question1.Controllers
{
    [Authorize]
    public class FacultyController : Controller
    {
        // GET: Faculty
        public ActionResult Insert()
        {

            return View();
        }

        [HttpPost]
        public ActionResult Insert(string topic, string topicd, string presenter, string location)
        {
            if (topic.Equals(null) && topicd.Equals(null) && presenter.Equals(null) && location.Equals(null))
            {
                return View();
            }
            else
            {
                DataManagar.Insert(topic, topicd, presenter, location);
                return RedirectToAction("Index", "Home");
            }
        }

        public ActionResult Update(int Id)
        {
            List<Presenter> Faculties = DataManagar.getData();
            Presenter Faculty = Faculties.Find((e) => e.Id == Id);
            return View(Faculty);
        }

        [HttpPost]
        public ActionResult Update(int id,string topic, string topicd, string presenter, string location)
        {
            if (topic.Equals(null) && topicd.Equals(null) && presenter.Equals(null) && location.Equals(null))
            {
                return View();
            }
            else
            {
                Presenter model = new Presenter();
                model.Id = id;
                model.Topic = topic;
                model.Description = topicd;
                model.Faculty = presenter;
                model.Location = location;
                DataManagar.Update(model);
                return RedirectToAction("Index", "Home");
            }
        }
    }
}