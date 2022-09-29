package com.company;

import javax.swing.*;

public class Converter {
    public static void main(String[] args) {
        String sBin = JOptionPane.showInputDialog("Enter a binary Number : ");
        int n = Integer.parseInt(sBin, 2);
//        JOptionPane.showMessageDialog( null,
//                String.format("Decimal : %d, Hex : %s", n, Integer.toHexString(n)));

        String s = "Title name Message";
        JOptionPane.showConfirmDialog(null, String.format("Decimal : %d, Hex : %s", n, Integer.toHexString(n)));
    }
}
