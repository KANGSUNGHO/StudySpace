using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Calculator
{
    public enum Operators { Add, Sub, Multi, Div}

    public partial class Form1 : Form
    {
        public int Result = 0;
        public bool isNewNum = true;
        public Operators Opt = Operators.Add;

        public Form1()
        {
            InitializeComponent();

        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }
        public int Add(int number1, int number2)
        {
            int add = number1 + number2;
            return add;
        }

        public int Sub(int number1, int number2)
        {
            int sub = number1 - number2;
            return sub;
        }
        public int Multi(int number1, int number2)
        {
            int mul = number1 * number2;
            return mul;
        }
        public int Div(int number1, int number2)
        {
            int div = number1 / number2;
            return div;
        }
        private void button1_Click(object sender, EventArgs e)
        {
            Button numButton = (Button)sender;
            SetNum(numButton.Text);
        }

        public void SetNum(String num)
        {
            if (isNewNum)
            {
                NumScreen.Text = num;
                isNewNum = false;
            }
            else if(NumScreen.Text == "0")
            {
                NumScreen.Text = num;
            }
            else
            {
                NumScreen.Text += num;
            }
        }

        private void NumPlus_Click(object sender, EventArgs e)
        {
            if(isNewNum == false)
            {
                int num = int.Parse(NumScreen.Text);
                if (Opt == Operators.Add)
                    Result = Add(Result, num);
                else if (Opt == Operators.Sub)
                    Result = Sub(Result, num);
                else if (Opt == Operators.Multi)
                    Result = Multi(Result, num);
                else if (Opt == Operators.Div)
                    Result = Div(Result, num);

                NumScreen.Text = Result.ToString();
                isNewNum = true;
            }

            Button optButton = (Button)sender;
            if (optButton.Text == "+")
                Opt = Operators.Add;
            else if (optButton.Text == "-")
                Opt = Operators.Sub;
            else if (optButton.Text == "x")
                Opt = Operators.Multi;
            else if (optButton.Text == "/")
                Opt = Operators.Div;
        }

        private void NumClear_Click(object sender, EventArgs e)
        {
            Result = 0;
            isNewNum = true;
            Opt = Operators.Add;

            NumScreen.Text = "0";
        }

        // 변수 = 0;

        // 숫자입력
        // 더하기 버튼 - 숫자 완성, 변수와 숫자 합, 결과를 변수에 다시 저장
        // 숫자입력
        // 더하기 버튼 - 숫자 완성, 변수와 숫자 합, 결과를 변수에 다시 저장
        // 숫자입력
        // 더하기 버튼 - 숫자 완성, 변수와 숫자 합, 결과를 변수에 다시 저장


        // 변수 = 0
        // 연산자 = +

        // 숫자입력
        // 연산자 버튼 - 숫자 완성, 변수와 숫자를 저장한 연산자로 연산, 결과를 변수에 저장, 현재 연산자를 저장.


    }
}
