/*
 * PB4NB
 *
 * Copyright (c) 2010 Jiri Pospisil (jiripospisil.info)
 *
 * This software is licensed under the New BSD License. See
 * license.txt in the root directory of this software package
 * for more details.
 *
 */
package info.jiripospisil.pb4nb.actions;

import info.jiripospisil.pb4nb.ui.PostDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;

/**
 *
 * @author Jiri Pospisil <mekishizufu@gmail.com>
 */
@ActionID(
    category = "Tools",
    id = "info.jiripospisil.pb4nb.actions"
)

@ActionReferences({
    @ActionReference(path = "Editors/Popup"),
    @ActionReference(path = "Shortcuts", name = "CA-P CA-B")
})

@ActionRegistration(displayName = "New Paste (Pastebin.com)")
public final class SendSelectedTextAction implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PostDialog().setVisible(true);
            }
        });
    }
}
