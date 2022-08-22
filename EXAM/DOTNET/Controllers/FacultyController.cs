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
        public ActionResult Insert(string Topic, string Description, string Faculty, string Location)
        {
            if (Topic.Equals(null) && Description.Equals(null) && Faculty.Equals(null) && Location.Equals(null))
            {
                return View();
            }
            else
            {
                DataManagar.Insert(Topic, Description, Faculty, Location);
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
        public ActionResult Update(string Topic, string Description, string Faculty, string Location)
        {
            if (Topic.Equals(null) && Description.Equals(null) && Faculty.Equals(null) && Location.Equals(null))
            {
                return View();
            }
            else
            {
                Presenter model = new Presenter();
                model.Topic = Topic;
                model.Description = Description;
                model.Faculty = Faculty;
                model.Location = Location;
                DataManagar.Update(model);
                return RedirectToAction("Index", "Home");
            }
        }
    }
}