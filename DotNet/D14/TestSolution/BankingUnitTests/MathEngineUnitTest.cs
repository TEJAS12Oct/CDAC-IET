using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;
using MathLib;

namespace BankingUnitTests
{
    [TestClass]
    public class MathEngineUnitTest
    {
        [TestMethod]
        public void TestEquality()
        {
            double expected = 89;
            double actual = 89;

            Assert.AreEqual(expected, actual, "Result is correct");
        }

        [TestMethod]
        public void TestInEquality()
        {
            double expected = 765;
            double actual = 89;
            Assert.AreEqual(expected, actual, "Result is correct");
        }

        [TestMethod]
        public void TestAddition()
        {
            //arrange  :Test Data
            int num1 = 56;
            int num2 = 44;
            int expected = 100;

            //AUT
            MathEngine math = new MathEngine();
            math.Addition(num1, num2);
            int actual = math.Result;

            //ACT
            //ASSERT
            Assert.AreEqual(expected, actual, "Addition is correct");
        }

        [TestMethod]
        public void TestAddition2()
        {
            //arrange  :Test Data
            int num1 = 765;
            int num2 = 98;
            int expected = 863;

            //AUT
            MathEngine math = new MathEngine();
            math.Addition(num1, num2);
            int actual = math.Result;

            //ACT
            //ASSERT
            Assert.AreEqual(expected, actual, "Addition is correct");
        }

        [TestMethod]
        public void TestAddition3()
        {
            //arrange  :Test Data
            int num1 = 77;
            int num2 = 11;
            int expected = 88;

            //AUT
            MathEngine math = new MathEngine();
            math.Addition(num1, num2);
            int actual = math.Result;

            //ACT
            //ASSERT
            Assert.AreEqual(expected, actual, "Addition is correct");
        }

    }
}
