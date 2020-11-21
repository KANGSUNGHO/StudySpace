using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace HelloCSharpWin
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void SumNumbers_Click(object sender, EventArgs e)
        {
            int number1 = 0;
            int number2 = 0;

            if (String.IsNullOrWhiteSpace(Sum1.Text))
            {
                MessageBox.Show("Sum1에 숫자를 입력해주세요.");
                Sum1.Focus();
                return; // function에서 빠져 나오고 싶을때 return해줌
            }

            if(int.TryParse(Sum1.Text, out number1) == false) // Sum1.Text가 숫자로 바꿀 수 있는 문자열이라면 number1에 숫자가 저장됨.
            {
                MessageBox.Show("Sum1에 문자가 들어왔습니다. 숫자를 입력해주세요.");
                Sum1.SelectAll(); // Sum1에 있는 텍스트들을 다 선택해줌
                Sum1.Focus();
                return;
            }

            if (String.IsNullOrWhiteSpace(Sum2.Text))
            {
                MessageBox.Show("Sum2에 숫자를 입력해주세요.");
                return; // function에서 빠져 나오고 싶을때 return해줌
            }

            if (int.TryParse(Sum2.Text, out number2) == false) // Sum2.Text가 숫자로 바꿀 수 있는 문자열이라면 number2에 숫자가 저장됨.
            {
                MessageBox.Show("Sum2에 문자가 들어왔습니다. 숫자를 입력해주세요.");
                return;
            }

            number1 = Convert.ToInt32(Sum1.Text);
            number2 = Convert.ToInt32(Sum2.Text);

            int sum = Add(number1, number2);
            SumResult.Text = sum.ToString();
        }

        public int Add(int number1, int number2)
        {
            int sum = number1 + number2;
            return sum; 
        }

        public float Add2(float number1, float number2)
        {
            float sum = number1 + number2;
            return sum;
        }

        public int Sub(int number1, int number2)
        {
            int sub = number1 - number2;
            return sub;
        }
    }
}
