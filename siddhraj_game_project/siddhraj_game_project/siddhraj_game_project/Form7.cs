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
    public partial class Form7 : Form
    {
        int sum, a;
        public Form7()
        {
            InitializeComponent();
        }
        public Form7(int sum,int a)
        {
            InitializeComponent();
            this.sum = sum;
            this.a = a;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            while (a == 5)
            {
                sum += 5;
                a++;
                Form8 f = new Form8(sum, a);
                f.Show();
                this.Hide();
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            a++;
            Form8 f = new Form8(sum, a);
            f.Show();
            this.Hide();
        }
    }
}
