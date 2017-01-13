package ua.com.lig.components;
public class LoginForm extends com.codename1.ui.Form {
    public LoginForm() {
        this(com.codename1.ui.util.Resources.getGlobalResources());
    }
    
    public LoginForm(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }
    
//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_Components = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Label gui_eMailLabel = new com.codename1.ui.Label();
    private com.codename1.ui.TextField gui_eMailEditText = new com.codename1.ui.TextField();
    private com.codename1.ui.Label gui_passwordLabel = new com.codename1.ui.Label();
    private com.codename1.ui.TextField gui_passwordEditText = new com.codename1.ui.TextField();
    private com.codename1.ui.Button gui_loginButton = new com.codename1.ui.Button();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BorderLayout());
        setTitle("LoginForm");
        setName("LoginForm");
        ((com.codename1.ui.layouts.BorderLayout)getLayout()).setCenterBehavior(com.codename1.ui.layouts.BorderLayout.CENTER_BEHAVIOR_CENTER);
        addComponent(com.codename1.ui.layouts.BorderLayout.CENTER, gui_Components);
        gui_Components.setName("Components");
        gui_Components.addComponent(gui_eMailLabel);
        gui_Components.addComponent(gui_eMailEditText);
        gui_Components.addComponent(gui_passwordLabel);
        gui_Components.addComponent(gui_passwordEditText);
        gui_Components.addComponent(gui_loginButton);
        gui_eMailLabel.setText("E-mail");
        gui_eMailLabel.setName("eMailLabel");
        gui_eMailEditText.setHint("E-mail");
        gui_eMailEditText.setText("");
        gui_eMailEditText.setName("eMailEditText");
        gui_eMailEditText.setRows(1);
        gui_passwordLabel.setText("Password");
        gui_passwordLabel.setName("passwordLabel");
        gui_passwordEditText.setHint("Password");
        gui_passwordEditText.setText("");
        gui_passwordEditText.setName("passwordEditText");
        gui_passwordEditText.setConstraint(com.codename1.ui.TextArea.PASSWORD);
        gui_loginButton.setText("Login");
        gui_loginButton.setName("loginButton");
        gui_Components.setName("Components");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}
