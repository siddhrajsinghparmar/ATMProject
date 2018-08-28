using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace siddhraj_game_project
{
    public partial class Form8 : Form
    {
        int sum, a;
        public Form8()
        {
            InitializeComponent();
        }
        public Form8(int sum,int a)
        {
            InitializeComponent();
            this.sum = sum;
            this.a = a;
        }
        private void button1_Click(object sender, EventArgs e)
        {
            
            
        }

        private void Form8_Load(object sender, EventArgs e)
        {
            if (sum == 11)
            {
                pictureBox1.BackgroundImage = Properties.Resources.d11;
            }
            else if(sum==14)
            {
                pictureBox1.BackgroundImage = Properties.Resources.h01;
            }
            else if(sum==5)
            {
                pictureBox1.BackgroundImage = Properties.Resources.s12;
            }
            else if(sum==8)
            {
                pictureBox1.BackgroundImage = Properties.Resources.h10;
            }
            else if(sum==13)
            {
                pictureBox1.BackgroundImage = Properties.Resources.c13;
            }
            else if (sum == 9)
            {
                pictureBox1.BackgroundImage = Properties.Resources.h08;
            }
            else
            {
                pictureBox1.BackgroundImage = Properties.Resources.dp2;
            }
        }

        private void button1_Click_1(object sender, EventArgs e)
        {
            Form1 f =new Form1();
            f.Show();
            this.Hide();
        }
    }
}
