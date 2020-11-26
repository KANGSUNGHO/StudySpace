using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace AnimalShelter
{
    public partial class Form1 : Form
    {
        public Customer[] CustomerArray = new Customer[10];
        public int CustomerArrayIndex = 0;

        public Form1()
        {
            InitializeComponent();
        }

        private void CreateCustomer_Click(object sender, EventArgs e)
        {

            CustomerArray[CustomerArrayIndex] = new AnimalShelter.Customer(CusNewFirstName.Text,CusNewLastName.Text ,
                DateTime.Parse(CusNewBirthDay.Text));
            CustomerArray[CustomerArrayIndex].Address = CusNewAddress.Text;
            CustomerArray[CustomerArrayIndex].Description = CusNewDescription.Text;

            CustomerList.Items.Add(CustomerArray[CustomerArrayIndex].FirstName);
            CustomerArrayIndex++;

         
        }
        public void ShowDetails(Customer cus)
        {
            CusFullName.Text = cus.FullName;
            CusAddress.Text = cus.Address;
            CusAge.Text = cus.Age1.ToString();
            CusDescription.Text = cus.Description;
            CusIsQualified.Text = cus.IsQualified1.ToString();
        }

        private void CustomerList_Click(object sender, EventArgs e)
        {
            string firstName = CustomerList.SelectedItem.ToString();

            for(int i = 0; i < CustomerArrayIndex; i++)
            {
                if( CustomerArray[i].FirstName == firstName)
                {
                    ShowDetails(CustomerArray[i]);
                    break;
                }
            }
        }
    }
}
