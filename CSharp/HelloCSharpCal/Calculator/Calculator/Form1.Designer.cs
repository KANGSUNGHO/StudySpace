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
            this.SuspendLayout();
            // 
            // NumScreen
            // 
            this.NumScreen.Location = new System.Drawing.Point(46, 22);
            this.NumScreen.Name = "NumScreen";
            this.NumScreen.Size = new System.Drawing.Size(435, 28);
            this.NumScreen.TabIndex = 0;
            this.NumScreen.Text = "0";
            this.NumScreen.TextChanged += new System.EventHandler(this.textBox1_TextChanged);
            // 
            // Number1
            // 
            this.Number1.Location = new System.Drawing.Point(67, 109);
            this.Number1.Name = "Number1";
            this.Number1.Size = new System.Drawing.Size(75, 40);
            this.Number1.TabIndex = 1;
            this.Number1.Text = "1";
            this.Number1.UseVisualStyleBackColor = true;
            this.Number1.Click += new System.EventHandler(this.button1_Click);
            // 
            // Number2
            // 
            this.Number2.Location = new System.Drawing.Point(157, 109);
            this.Number2.Name = "Number2";
            this.Number2.Size = new System.Drawing.Size(75, 40);
            this.Number2.TabIndex = 2;
            this.Number2.Text = "2";
            this.Number2.UseVisualStyleBackColor = true;
            this.Number2.Click += new System.EventHandler(this.button2_Click);
            // 
            // NumPlus
            // 
            this.NumPlus.Location = new System.Drawing.Point(469, 109);
            this.NumPlus.Name = "NumPlus";
            this.NumPlus.RightToLeft = System.Windows.Forms.RightToLeft.No;
            this.NumPlus.Size = new System.Drawing.Size(75, 39);
            this.NumPlus.TabIndex = 3;
            this.NumPlus.Text = "+";
            this.NumPlus.UseVisualStyleBackColor = true;
            this.NumPlus.Click += new System.EventHandler(this.NumPlus_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(10F, 18F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(575, 268);
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
    }
}

