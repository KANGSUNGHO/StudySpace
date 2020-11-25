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
        public Form1()
        {
            InitializeComponent();
        }

        private void CreateCustomer_Click(object sender, EventArgs e)
        {

            Customer cus = new AnimalShelter.Customer("Ian", "Na", new DateTime(1996,1,1));
            cus.Address = "경기도 의정부";
            cus.Description = "안녕하세요 반갑습니다.";

            CusFullName.Text = cus.FullName;
            CusAddress.Text = cus.Address;
            CusAge.Text = cus.Age1.ToString();
            CusDescription.Text = cus.Description;
            CusIsQualified.Text = cus.IsQualified1.ToString();
        }
    }
}
