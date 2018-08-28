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
    public partial class Form3 : Form
    {
        public Form3()
        {
            InitializeComponent();
        }

        int sum = 0;
        int a = 1;
        private void button1_Click(object sender, EventArgs e)
        {
            while( a==1)
            {
                sum += 1;
                a++;
            }
            Form4 f = new Form4(sum,a);
            f.Show();
            this.Hide();

        }

        private void button2_Click(object sender, EventArgs e)
        {
            a++;
           
            Form4 f = new Form4(sum, a);
            f.Show();
            this.Hide();
        }

        private void Form3_Load(object sender, EventArgs e)
        {

        }

        private void button2_MouseHover(object sender, EventArgs e)
        {
            button2.BackColor = Color.Aqua;
        }
       
    }
}
