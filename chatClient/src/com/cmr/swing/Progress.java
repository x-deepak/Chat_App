/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cmr.swing;

import javax.swing.JProgressBar;

public class Progress extends JProgressBar {

    public Progress() {
        setOpaque(false);
        setUI(new ProgressCircleUI(this));
    }
}
