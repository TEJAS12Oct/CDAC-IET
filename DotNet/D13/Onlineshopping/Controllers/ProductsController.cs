using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using Onlineshopping.Models;

namespace Onlineshopping.Controllers;

public class ProductsController : Controller
{
    private readonly ILogger<ProductsController> _logger;

    public ProductsController(ILogger<ProductsController> logger)
    {
        _logger = logger;
    }

    public IActionResult Index()
    {
        return View();
    }

    public IActionResult Details(int id)
    {

        switch(id){
            case 1:
            {ViewData["product"]=new  Product{ Id=1, 
                                           Title="Gerbera", 
                                           Description="Wedding Flower",
                                           Quantity=6700,
                                          };

            }
            break;

            case 2:
            {
                ViewData["product"]=new  Product{ Id=1, 
                                           Title="Rose", 
                                           Description="Valentine Flower",
                                           Quantity=600,
                                          };
            }
            break;
            case 3:
            {
                ViewData["product"]=new  Product{ Id=1, 
                                           Title="Marigold", 
                                           Description="Festival Flower",
                                           Quantity=8700,
                                          };
            }
            break;
        }
        
        return View();
    }

       

}
