using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using System.Threading;

namespace SeleniumAutomationApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string chromeExecutable = @"D:\drv\";
            IWebDriver driver = null;
            driver = new ChromeDriver(chromeExecutable);

            driver.Navigate().GoToUrl("https://www.google.com");
            Thread.Sleep(5000);

            IWebElement element = driver.FindElement(By.Name("q"));
            element.SendKeys("Ravi Tambade");

            Thread.Sleep(3000);

            IWebElement elementButton = driver.FindElement(By.Name("btnK"));
            elementButton.Click();

            Thread.Sleep(5000);
            Console.WriteLine("Press any key to continue");
            Console.ReadLine();

        }
    }
}
