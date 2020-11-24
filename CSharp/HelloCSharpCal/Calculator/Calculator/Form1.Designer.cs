namespace Calculator
{
    partial class Form1
    {
        /// <summary>
        /// 필수 디자이너 변수입니다.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// 사용 중인 모든 리소스를 정리합니다.
        /// </summary>
        /// <param name="disposing">관리되는 리소스를 삭제해야 하면 true이고, 그렇지 않으면 false입니다.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form 디자이너에서 생성한 코드

        /// <summary>
        /// 디자이너 지원에 필요한 메서드입니다. 
        /// 이 메서드의 내용을 코드 편집기로 수정하지 마세요.
        /// </summary>
        private void InitializeComponent()
        {
            this.NumScreen = new System.Windows.Forms.TextBox();
            this.Number1 = new System.Windows.Forms.Button();
            this.Number2 = new System.Windows.Forms.Button();
            this.NumPlus = new System.Windows.Forms.Button();
            this.Number3 = new System.Windows.Forms.Button();
            this.Number4 = new System.Windows.Forms.Button();
            this.Number5 = new System.Windows.Forms.Button();
            this.Number6 = new System.Windows.Forms.Button();
            this.Number7 = new System.Windows.Forms.Button();
            this.Number8 = new System.Windows.Forms.Button();
            this.Number9 = new System.Windows.Forms.Button();
            this.Number0 = new System.Windows.Forms.Button();
            this.button1 = new System.Windows.Forms.Button();
            this.NumClear = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            this.button3 = new System.Windows.Forms.Button();
            this.button4 = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // NumScreen
            // 
            this.NumScreen.Location = new System.Drawing.Point(67, 22);
            this.NumScreen.Name = "NumScreen";
            this.NumScreen.Size = new System.Drawing.Size(339, 28);
            this.NumScreen.TabIndex = 0;
            this.NumScreen.Text = "0";
            this.NumScreen.TextChanged += new System.EventHandler(this.textBox1_TextChanged);
            // 
            // Number1
            // 
            this.Number1.Location = new System.Drawing.Point(67, 247);
            this.Number1.Name = "Number1";
            this.Number1.Size = new System.Drawing.Size(75, 40);
            this.Number1.TabIndex = 1;
            this.Number1.Text = "1";
            this.Number1.UseVisualStyleBackColor = true;
            this.Number1.Click += new System.EventHandler(this.button1_Click);
            // 
            // Number2
            // 
            this.Number2.Location = new System.Drawing.Point(148, 247);
            this.Number2.Name = "Number2";
            this.Number2.Size = new System.Drawing.Size(75, 40);
            this.Number2.TabIndex = 2;
            this.Number2.Text = "2";
            this.Number2.UseVisualStyleBackColor = true;
            this.Number2.Click += new System.EventHandler(this.button1_Click);
            // 
            // NumPlus
            // 
            this.NumPlus.Location = new System.Drawing.Point(331, 248);
            this.NumPlus.Name = "NumPlus";
            this.NumPlus.RightToLeft = System.Windows.Forms.RightToLeft.No;
            this.NumPlus.Size = new System.Drawing.Size(75, 39);
            this.NumPlus.TabIndex = 3;
            this.NumPlus.Text = "+";
            this.NumPlus.UseVisualStyleBackColor = true;
            this.NumPlus.Click += new System.EventHandler(this.NumPlus_Click);
            // 
            // Number3
            // 
            this.Number3.Location = new System.Drawing.Point(229, 247);
            this.Number3.Name = "Number3";
            this.Number3.Size = new System.Drawing.Size(75, 40);
            this.Number3.TabIndex = 4;
            this.Number3.Text = "3";
            this.Number3.UseVisualStyleBackColor = true;
            this.Number3.Click += new System.EventHandler(this.button1_Click);
            // 
            // Number4
            // 
            this.Number4.Location = new System.Drawing.Point(67, 183);
            this.Number4.Name = "Number4";
            this.Number4.Size = new System.Drawing.Size(75, 40);
            this.Number4.TabIndex = 5;
            this.Number4.Text = "4";
            this.Number4.UseVisualStyleBackColor = true;
            this.Number4.Click += new System.EventHandler(this.button1_Click);
            // 
            // Number5
            // 
            this.Number5.Location = new System.Drawing.Point(148, 183);
            this.Number5.Name = "Number5";
            this.Number5.Size = new System.Drawing.Size(75, 40);
            this.Number5.TabIndex = 6;
            this.Number5.Text = "5";
            this.Number5.UseVisualStyleBackColor = true;
            this.Number5.Click += new System.EventHandler(this.button1_Click);
            // 
            // Number6
            // 
            this.Number6.Location = new System.Drawing.Point(229, 183);
            this.Number6.Name = "Number6";
            this.Number6.Size = new System.Drawing.Size(75, 40);
            this.Number6.TabIndex = 7;
            this.Number6.Text = "6";
            this.Number6.UseVisualStyleBackColor = true;
            this.Number6.Click += new System.EventHandler(this.button1_Click);
            // 
            // Number7
            // 
            this.Number7.Location = new System.Drawing.Point(67, 120);
            this.Number7.Name = "Number7";
            this.Number7.Size = new System.Drawing.Size(75, 40);
            this.Number7.TabIndex = 8;
            this.Number7.Text = "7";
            this.Number7.UseVisualStyleBackColor = true;
            this.Number7.Click += new System.EventHandler(this.button1_Click);
            // 
            // Number8
            // 
            this.Number8.Location = new System.Drawing.Point(148, 120);
            this.Number8.Name = "Number8";
            this.Number8.Size = new System.Drawing.Size(75, 40);
            this.Number8.TabIndex = 9;
            this.Number8.Text = "8";
            this.Number8.UseVisualStyleBackColor = true;
            this.Number8.Click += new System.EventHandler(this.button1_Click);
            // 
            // Number9
            // 
            this.Number9.Location = new System.Drawing.Point(229, 120);
            this.Number9.Name = "Number9";
            this.Number9.Size = new System.Drawing.Size(75, 40);
            this.Number9.TabIndex = 10;
            this.Number9.Text = "9";
            this.Number9.UseVisualStyleBackColor = true;
            this.Number9.Click += new System.EventHandler(this.button1_Click);
            // 
            // Number0
            // 
            this.Number0.Location = new System.Drawing.Point(148, 309);
            this.Number0.Name = "Number0";
            this.Number0.Size = new System.Drawing.Size(75, 40);
            this.Number0.TabIndex = 11;
            this.Number0.Text = "0";
            this.Number0.UseVisualStyleBackColor = true;
            this.Number0.Click += new System.EventHandler(this.button1_Click);
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(331, 184);
            this.button1.Name = "button1";
            this.button1.RightToLeft = System.Windows.Forms.RightToLeft.No;
            this.button1.Size = new System.Drawing.Size(75, 39);
            this.button1.TabIndex = 12;
            this.button1.Text = "-";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.NumPlus_Click);
            // 
            // NumClear
            // 
            this.NumClear.Location = new System.Drawing.Point(148, 75);
            this.NumClear.Name = "NumClear";
            this.NumClear.RightToLeft = System.Windows.Forms.RightToLeft.No;
            this.NumClear.Size = new System.Drawing.Size(75, 39);
            this.NumClear.TabIndex = 13;
            this.NumClear.Text = "C";
            this.NumClear.UseVisualStyleBackColor = true;
            this.NumClear.Click += new System.EventHandler(this.NumClear_Click);
            // 
            // button2
            // 
            this.button2.Location = new System.Drawing.Point(329, 310);
            this.button2.Name = "button2";
            this.button2.RightToLeft = System.Windows.Forms.RightToLeft.No;
            this.button2.Size = new System.Drawing.Size(75, 39);
            this.button2.TabIndex = 14;
            this.button2.Text = "=";
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.NumPlus_Click);
            // 
            // button3
            // 
            this.button3.Location = new System.Drawing.Point(331, 120);
            this.button3.Name = "button3";
            this.button3.RightToLeft = System.Windows.Forms.RightToLeft.No;
            this.button3.Size = new System.Drawing.Size(75, 39);
            this.button3.TabIndex = 15;
            this.button3.Text = "/";
            this.button3.UseVisualStyleBackColor = true;
            this.button3.Click += new System.EventHandler(this.NumPlus_Click);
            // 
            // button4
            // 
            this.button4.Location = new System.Drawing.Point(329, 56);
            this.button4.Name = "button4";
            this.button4.RightToLeft = System.Windows.Forms.RightToLeft.No;
            this.button4.Size = new System.Drawing.Size(75, 39);
            this.button4.TabIndex = 16;
            this.button4.Text = "x";
            this.button4.UseVisualStyleBackColor = true;
            this.button4.Click += new System.EventHandler(this.NumPlus_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(10F, 18F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(416, 391);
            this.Controls.Add(this.button4);
            this.Controls.Add(this.button3);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.NumClear);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.Number0);
            this.Controls.Add(this.Number9);
            this.Controls.Add(this.Number8);
            this.Controls.Add(this.Number7);
            this.Controls.Add(this.Number6);
            this.Controls.Add(this.Number5);
            this.Controls.Add(this.Number4);
            this.Controls.Add(this.Number3);
            this.Controls.Add(this.NumPlus);
            this.Controls.Add(this.Number2);
            this.Controls.Add(this.Number1);
            this.Controls.Add(this.NumScreen);
            this.Name = "Form1";
            this.RightToLeft = System.Windows.Forms.RightToLeft.Yes;
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox NumScreen;
        private System.Windows.Forms.Button Number1;
        private System.Windows.Forms.Button Number2;
        private System.Windows.Forms.Button NumPlus;
        private System.Windows.Forms.Button Number3;
        private System.Windows.Forms.Button Number4;
        private System.Windows.Forms.Button Number5;
        private System.Windows.Forms.Button Number6;
        private System.Windows.Forms.Button Number7;
        private System.Windows.Forms.Button Number8;
        private System.Windows.Forms.Button Number9;
        private System.Windows.Forms.Button Number0;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Button NumClear;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.Button button3;
        private System.Windows.Forms.Button button4;
    }
}

