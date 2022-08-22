using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using System.Web.Security;
using Question1.Models;
using Question1.DAL;

namespace Question1.Controllers
{
    public class AccountController : Controller
    {
        // GET: Account
        public ActionResult Login()
        {
            return View();
        }

        [HttpPost]
        public ActionResult Login(string username, string password, string returnURL)
        {
            if (username == "Tejas@gmail.com" && password == "Tejas")
            {
                //this.Session[username] = username;
                //this.Response.Cookies.Add(new HttpCookie("token", username));
                FormsAuthentication.SetAuthCookie(username, false);
                return Redirect(returnURL ?? Url.Action("Index", "Home"));
            }
            return View();
        }
    }
}