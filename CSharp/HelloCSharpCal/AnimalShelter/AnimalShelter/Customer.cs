using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AnimalShelter
{
    public class Customer
    {
        public string FirstName;
        public string LastName;
        private DateTime BirthDay;
        private bool IsQualified;
        public string Address;
        public string Description;

        public Customer(string firstName, string lastName, DateTime BirthDay)
        {
            this.FirstName = firstName;
            this.LastName = lastName;
            this.BirthDay = BirthDay;

            this.IsQualified = Age1 >= 18;
        }

        /*
        public int getAge()
        {
            return Age;
        }

        public void setAge(int Age)
        {
            this.Age = Age;
            IsQualified = Age >= 18;
        }
        */
        public DateTime BirthDay1
        {
            get
            {
                return BirthDay;
            }
            set
            {
                BirthDay = value;
                IsQualified = Age1 >= 18;
            }
        }

        public int Age1
        {
            get {
                return DateTime.Now.Year - BirthDay.Year;
            }
        }

        
        /* 
        public bool getIsQualified()
        {
            return IsQualified;
        }
        */

        public bool IsQualified1
        {
            get
            {
                return IsQualified;
            }
        }
        /*
        public string GetFullName()
        {
            return FirstName + " " + LastName;
        }
        */

        public string FullName
        {
            get
            {
                return FirstName + " " + LastName;
            }
        }
    }
}
