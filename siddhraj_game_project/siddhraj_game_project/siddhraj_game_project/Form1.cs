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
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
           
            Form2 f = new Form2();
            f.Show();
            this.Hide();
            
        }

        private void Form1_MouseEnter(object sender, EventArgs e)
        {

        }

        private void button1_MouseMove(object sender, MouseEventArgs e)
        {
        }

        private void button1_BackColorChanged(object sender, EventArgs e)
        {
        }

        private void button1_MouseHover(object sender, EventArgs e)
        {
            button1.BackColor = Color.Aqua;
        }

        private void button1_MouseLeave(object sender, EventArgs e)
        {
            button1.BackColor = Color.DimGray;
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void labelInstruction_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Instruction\n1. Choose anyone card and Remember it.\n2. Now If you find that card then press 'YES' if not then press 'NO' ");
           
        }
    }
}
