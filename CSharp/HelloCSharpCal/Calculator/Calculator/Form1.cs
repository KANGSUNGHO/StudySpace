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
    public partial class Form1 : Form
    {
        public int Result = 0;
        public bool isNewNum = true;

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
        public float Add(float number1, float number2)
        {
            float add = number1 + number2;
            return add;
        }

        public int Sub(int number1, int number2)
        {
            int sub = number1 - number2;
            return sub;
        }
        private void button1_Click(object sender, EventArgs e)
        {
            SetNum("1");
        }
        private void button2_Click(object sender, EventArgs e)
        {
            SetNum("2");
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
            int num = int.Parse(NumScreen.Text);
            Result += num;

            NumScreen.Text = Result.ToString();
            isNewNum = true;
        }

        // 변수 = 0;

        // 숫자입력
        // 더하기 버튼 - 숫자 완성, 변수와 숫자 합, 결과를 변수에 다시 저장
        // 숫자입력
        // 더하기 버튼 - 숫자 완성, 변수와 숫자 합, 결과를 변수에 다시 저장
        // 숫자입력
        // 더하기 버튼 - 숫자 완성, 변수와 숫자 합, 결과를 변수에 다시 저장

    }
}
