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
    public partial class Form5 : Form
    {
        public Form5()
        {
            InitializeComponent();
        }
        int sum, a;
        public Form5(int sum,int a)
        {
            InitializeComponent();
            this.sum = sum;
            this.a = a;
        }
        private void button1_Click(object sender, EventArgs e)
        {
            while (a == 3)
            {
                sum += 3;
                a++;
            }
            Form6 f = new Form6(sum,a);
            f.Show();
            this.Hide();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            a++;
            Form6 f = new Form6(sum, a);
            f.Show();
            this.Hide();
        }
    }
}
