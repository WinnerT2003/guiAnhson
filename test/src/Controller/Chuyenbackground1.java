/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Entity.Danhmucchuyen;
import View.QlyNhanvien;
import View.QlyThuoc;
import View.Qlyhen;
import View.ThanhtoanDTview;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author AD
 */
public class Chuyenbackground1 {
        private JPanel root;
    private String kinSelected ="";
    private List<Danhmucchuyen> listItem = null;
    public Chuyenbackground1(JPanel root){
        this.root = root;
    }
    public void Setview(JPanel JfrItem, JLabel jlbItem)
    {
        kinSelected = "Thongke";
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new QlyNhanvien());
        root.validate();
        root.repaint();
    }
    public void SetEvent(List<Danhmucchuyen> listItem){
        this.listItem = listItem;
        for(Danhmucchuyen Dm: listItem){
            Dm.getJbl().addMouseListener(new LabelEvent(Dm.getKind(), Dm.getJpn(),Dm.getJbl()));
        }
    }
    class LabelEvent implements MouseListener{
        private JPanel node;
        private String kind;
        private JPanel JpnItem;
        private JLabel JlbItem;

        public LabelEvent(String kind, JPanel JpnItem, JLabel JlbItem) {
            this.kind = kind;
            this.JpnItem = JpnItem;
            this.JlbItem = JlbItem;
        }
        @Override
        public void mouseClicked(MouseEvent e) {
            switch(kind){
                case "Thongke":
                   node = new Qlyhen();
                   break;
                case "GioHang":
                   node = new QlyThuoc();
                   break;
                case "Thanhtoan":
                   node = new ThanhtoanDTview();
                   break;
                default:
                    node = new Qlyhen();
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            SetchangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
             kinSelected = kind;
           JpnItem.setBackground(Color.red);
           JlbItem.setBackground(Color.red);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
            
        }
        private void SetchangeBackground(String kind)
        {
            for(Danhmucchuyen item: listItem){
                if(item.getKind().equalsIgnoreCase(kind)){
                    item.getJbl().setBackground(Color.red);
                    item.getJpn().setBackground(Color.red);
                }
                else{
                    item.getJbl().setBackground(Color.BLUE);
                    item.getJpn().setBackground(Color.BLUE);
                }
            }
    }
}
}
