package movieselector;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.dom4j.DocumentException;

/**
 *
 * @author jrtew
 */
public class MovieSelectorUI extends javax.swing.JFrame {

    /**
     * Creates new form MovieSelectorUI
     */
    public MovieSelectorUI() {
        initComponents();
    }
    
    XMLQuery xmlQuery = new XMLQuery();
    SearchMovies newSearch = new SearchMovies();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        moodBox2 = new javax.swing.JComboBox();
        moodBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        femaleRadioButton = new javax.swing.JRadioButton();
        maleRadioButton = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        yearSlider = new javax.swing.JSlider();
        jLabel6 = new javax.swing.JLabel();
        shortRadio = new javax.swing.JRadioButton();
        mediumRadio = new javax.swing.JRadioButton();
        longRadio = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        scoreSlider = new javax.swing.JSlider();
        jLabel8 = new javax.swing.JLabel();
        yesRadio = new javax.swing.JRadioButton();
        noRadio = new javax.swing.JRadioButton();
        eitherRadio = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        yearValue = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        scoreValue = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mood Based Movie Selector");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mood Selection", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setText("First Mood");

        moodBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Grumpy", "Mad", "Stressed", "Energetic", "Peaceful", "Melancholy" }));

        moodBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cheerful", "Angry", "Good", "Happy", "Sad", "Weird" }));
        moodBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moodBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Second Mood");

        jLabel3.setText("Gender");

        buttonGroup3.add(femaleRadioButton);
        femaleRadioButton.setText("Female");
        femaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup3.add(maleRadioButton);
        maleRadioButton.setText("Male");
        maleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(moodBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(moodBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(femaleRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(maleRadioButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moodBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moodBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(femaleRadioButton)
                    .addComponent(maleRadioButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Other Parameters", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel5.setText("Release Year Cut-Off");

        yearSlider.setMajorTickSpacing(5);
        yearSlider.setMaximum(2014);
        yearSlider.setMinimum(1935);
        yearSlider.setPaintTicks(true);
        yearSlider.setToolTipText("Returns Movies with Release Dates After the Selected Cut-Off Date");
        yearSlider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                yearSliderMouseMoved(evt);
            }
        });

        jLabel6.setText("Length of Movie");

        buttonGroup1.add(shortRadio);
        shortRadio.setText("Short");
        shortRadio.setToolTipText("Returns Movies Less than or Equal to 100 Minutes Long");
        shortRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shortRadioActionPerformed(evt);
            }
        });

        buttonGroup1.add(mediumRadio);
        mediumRadio.setText("Medium");
        mediumRadio.setToolTipText("Returns Movies Less than or Equal to 135 Minutes Long");
        mediumRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumRadioActionPerformed(evt);
            }
        });

        buttonGroup1.add(longRadio);
        longRadio.setSelected(true);
        longRadio.setText("Long");
        longRadio.setToolTipText("Returns Movies of All Lengths");
        longRadio.setActionCommand("long");
        longRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                longRadioActionPerformed(evt);
            }
        });

        jLabel7.setText("Minimum IMDb Rating");

        scoreSlider.setMajorTickSpacing(1);
        scoreSlider.setMaximum(10);
        scoreSlider.setMinimum(1);
        scoreSlider.setPaintTicks(true);
        scoreSlider.setToolTipText("Returns Movies that Have an IMDb Rating Higher than or Equal to the Selected Rating");
        scoreSlider.setValue(1);
        scoreSlider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                scoreSliderMouseMoved(evt);
            }
        });

        jLabel8.setText("Award Winning?");

        buttonGroup2.add(yesRadio);
        yesRadio.setText("Yes");
        yesRadio.setToolTipText("Returns Movies that Have Won Awards");
        yesRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesRadioActionPerformed(evt);
            }
        });

        buttonGroup2.add(noRadio);
        noRadio.setText("No");
        noRadio.setToolTipText("Returns Movies that Have Not Won Awards");
        noRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noRadioActionPerformed(evt);
            }
        });

        buttonGroup2.add(eitherRadio);
        eitherRadio.setSelected(true);
        eitherRadio.setText("Either");
        eitherRadio.setToolTipText("Returrns Both Award Winning and Non-Award Winning Movies");
        eitherRadio.setActionCommand("either");
        eitherRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eitherRadioActionPerformed(evt);
            }
        });

        jLabel10.setText("1935");

        jLabel11.setText("2014");

        yearValue.setText("1935");

        jLabel12.setText("1");

        jLabel13.setText("10");

        scoreValue.setText("1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scoreValue)
                            .addGap(86, 86, 86)
                            .addComponent(jLabel13))
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(yearSlider, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(scoreSlider, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(58, 58, 58)
                            .addComponent(yearValue)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11)))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(shortRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mediumRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(longRadio))
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(yesRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eitherRadio)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yearSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(shortRadio)
                        .addComponent(mediumRadio)
                        .addComponent(longRadio)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yesRadio)
                            .addComponent(noRadio)
                            .addComponent(eitherRadio))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yearValue)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scoreSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(scoreValue))))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Your Movies", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel9.setText("Results:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel4.setText("Movie Statistics:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        searchButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        searchButton.setText("Search for Movies");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(searchButton)
                        .addGap(0, 173, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Exits the application:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // The search button starts the whole process:
        
        if (!femaleRadioButton.isSelected() && !maleRadioButton.isSelected()) {
            JOptionPane.showMessageDialog(null, "Tip: Select a gender for more accurate results.");
        }
        if (!jTextArea1.getText().equals(""))
            jTextArea1.setText("");
        if (!jTextArea2.getText().equals(""))
            jTextArea2.setText("");
        
        // The different variables are set for the search method to use:
        String[] genreArray;
        genreArray = Rules.getGenresFromMoods(moodBox1.getSelectedItem().toString(), moodBox2.getSelectedItem().toString());
        newSearch.setGenreVal(genreArray[0]);
        newSearch.setGenreVal2(genreArray[1]);
        newSearch.setReleasedVal(yearSlider.getValue());
        newSearch.setScoreVal(scoreSlider.getValue());
        newSearch.setColorVal("either");
        
        ArrayList<Movie> returnedMovies = new ArrayList();
        try {
            returnedMovies = newSearch.searchMovieList();
        } catch (DocumentException ex) {
            Logger.getLogger(MovieSelectorUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MovieSelectorUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (returnedMovies.size() > 3) {
            returnedMovies = newSearch.cutDownList(returnedMovies);
        }
        
        Movie tempyMoo = new Movie();
        
        // The selected movies are printed to the left side jTextArea:
        jTextArea1.append("Selected movies: \n");
        for (int i = 0; i < returnedMovies.size() ; i++) {
            tempyMoo = returnedMovies.get(i);
            jTextArea1.append("          " + tempyMoo.getTitle() + "\n");
        }
        
        // The following six statements are for determining and printing which
        // genre values have been applied to the decision, including after any 
        // gender rules have fired:
        String tempGenGen = "";
        if (!newSearch.getGenderGenre().equals("")) {
            if (!newSearch.getGenderGenre().equals(genreArray[0]) && !newSearch.getGenderGenre().equals(genreArray[1])) {
                tempGenGen = newSearch.getGenderGenre();
            }
        }
        String tempGenGen2 = "";
        if (!newSearch.getGenderGenre2().equals("")) {
            if (!newSearch.getGenderGenre2().equals(genreArray[0]) && !newSearch.getGenderGenre2().equals(genreArray[1])) {
                tempGenGen2 = newSearch.getGenderGenre2();
            }
        }
        if (!tempGenGen.equals("") && !tempGenGen2.equals("")) {
            jTextArea1.append("Movies selected based on Mood\nand/or Gender rules translating into\nthe following genres: "
                    + "\n          " + newSearch.getGenreVal() + "\n          "
                    + newSearch.getGenreVal2() + "\n          " + tempGenGen
                    + "\n          " + tempGenGen2);
        }
        else if (!tempGenGen.equals("") && tempGenGen2.equals("")) {
            jTextArea1.append("Movies selected based on Mood\nand/or Gender rules translating into\nthe following genres: "
                    + "\n          " + newSearch.getGenreVal() + "\n          "
                    + newSearch.getGenreVal2() + "\n          " + tempGenGen);
        }
        else if (tempGenGen.equals("") && !tempGenGen2.equals("")) {
            jTextArea1.append("Movies selected based on Mood\nand/or Gender rules translating into\nthe following genres: "
                    + "\n          " + newSearch.getGenreVal() + "\n          "
                    + newSearch.getGenreVal2() + "\n          " + tempGenGen2);
        } else {
            jTextArea1.append("Movies selected based on Mood\nand/or Gender rules translating into\nthe following genres: "
                    + "\n          " + newSearch.getGenreVal() + "\n          "
                    + newSearch.getGenreVal2());
        }
        
        // This for loop prints the movie stats in the right size jTextArea:
        for (int i = 0; i < returnedMovies.size() ; i++) {
            tempyMoo = returnedMovies.get(i);
            jTextArea2.append("Movie: " + tempyMoo.getTitle() + "\n");
            jTextArea2.append("     Runtime (in minutes): " + tempyMoo.getRuntime() + "\n");
            jTextArea2.append("     Release Date: " + tempyMoo.getReleaseDate() + "\n");
            jTextArea2.append("     IMDb Score: " + tempyMoo.getImdbScore() + "\n");
            jTextArea2.append("     Award Winning: " + tempyMoo.getAwards() + "\n");
            jTextArea2.append("     Color or Black & White: " + tempyMoo.getColor() + "\n");
            ArrayList tempyG = tempyMoo.getGenres();
            for (int j = 0; j < tempyG.size(); j++) {
                jTextArea2.append("     Genre: " + tempyG.get(j) + "\n");
            }
        }
        
        // Pop-up message if no movies meet the search parameters:
        if (returnedMovies.isEmpty()) {
            jTextArea1.setText("");
            JOptionPane.showMessageDialog(null, "No movies match your requested search\nparameters. Try broadening your search.");
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Clear the jTextArea box:
        jTextArea1.setText("");
        jTextArea2.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void moodBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moodBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moodBox1ActionPerformed

    private void eitherRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eitherRadioActionPerformed
        // use the "either" value for the awardsVal variable:
        if (eitherRadio.isSelected())
            newSearch.setAwardsVal("either");
    }//GEN-LAST:event_eitherRadioActionPerformed

    private void noRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noRadioActionPerformed
        // use the "no" value for the awardsVal variable:
        if (noRadio.isSelected())
            newSearch.setAwardsVal("no");
    }//GEN-LAST:event_noRadioActionPerformed

    private void yesRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesRadioActionPerformed
        // use the "yes" value for the awardsVal variable:
        if (yesRadio.isSelected())
            newSearch.setAwardsVal("yes");
    }//GEN-LAST:event_yesRadioActionPerformed

    private void scoreSliderMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scoreSliderMouseMoved
        // TODO add your handling code here:
        scoreValue.setText(String.valueOf(scoreSlider.getValue()));
    }//GEN-LAST:event_scoreSliderMouseMoved

    private void longRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_longRadioActionPerformed
        // If the long radio button is selected, set the runtime value to 500:
        if (longRadio.isSelected())
            newSearch.setRuntimeVal(Rules.getRuntime("long"));
    }//GEN-LAST:event_longRadioActionPerformed

    private void mediumRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediumRadioActionPerformed
        // If the medium radio button is selected, set the runtime value to 125:
        if (mediumRadio.isSelected())
            newSearch.setRuntimeVal(Rules.getRuntime("medium"));
    }//GEN-LAST:event_mediumRadioActionPerformed

    private void shortRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shortRadioActionPerformed
        // If the short radio button is selected, set the runtime value to 95:
        if (shortRadio.isSelected())
            newSearch.setRuntimeVal(Rules.getRuntime("short"));
    }//GEN-LAST:event_shortRadioActionPerformed

    private void yearSliderMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yearSliderMouseMoved
        // Displays slider value on jLabel below the slider:
        yearValue.setText(String.valueOf(yearSlider.getValue()));
    }//GEN-LAST:event_yearSliderMouseMoved

    private void femaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRadioButtonActionPerformed
        // Sets the gender variable in the SearchMovie class to female:
        if (femaleRadioButton.isSelected())
            newSearch.setGender("Female");
    }//GEN-LAST:event_femaleRadioButtonActionPerformed

    private void maleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioButtonActionPerformed
        // Sets the gender variable in the SearchMovie class to male:
        if (maleRadioButton.isSelected())
            newSearch.setGender("Male");
    }//GEN-LAST:event_maleRadioButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MovieSelectorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovieSelectorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovieSelectorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovieSelectorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovieSelectorUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JRadioButton eitherRadio;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JRadioButton longRadio;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JRadioButton mediumRadio;
    private javax.swing.JComboBox moodBox1;
    private javax.swing.JComboBox moodBox2;
    private javax.swing.JRadioButton noRadio;
    private javax.swing.JSlider scoreSlider;
    private javax.swing.JLabel scoreValue;
    private javax.swing.JButton searchButton;
    private javax.swing.JRadioButton shortRadio;
    private javax.swing.JSlider yearSlider;
    private javax.swing.JLabel yearValue;
    private javax.swing.JRadioButton yesRadio;
    // End of variables declaration//GEN-END:variables
}