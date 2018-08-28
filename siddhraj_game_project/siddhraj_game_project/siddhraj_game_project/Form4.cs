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
    public partial class Form4 : Form
    {
        
        public Form4()
        {
            InitializeComponent();
        }
        int sum, a;
        public Form4(int sum,int a)
        {
            InitializeComponent();
            this.sum = sum;
            this.a = a;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            while (a==2)
            {
                sum += 2;
                a++;
            }
            Form5 b = new Form5(sum,a);
            b.Show();
            this.Hide();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            a++;
            Form5 f = new Form5(sum, a);
            f.Show();
            this.Hide();
        
        }

        private void Form4_Load(object sender, EventArgs e)
        {

        }
    }
}
