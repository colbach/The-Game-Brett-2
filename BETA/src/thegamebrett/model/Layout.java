package thegamebrett.model;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;

/**
 * @author Christian Colbach
 */
public class Layout {
    
    /**  Hintergrungbild füllt ganzes Feld (Bild wird abgeschnitten damit es passt)*/
    public static final int BACKGROUND_IMAGE_FILL_FACTOR_FILL = 0;
    /** Hintergrungbild wird ganz angezeigt (Bild ist auf jeden Fall ganz im Feld)*/
    public static final int BACKGROUND_IMAGE_FILL_FACTOR_ASPECT = 1;
    /** Hintergrungbild wird ganz angezeigt (Bild ist auf jeden Fall ganz im Feld)*/
    public static final int BACKGROUND_IMAGE_FILL_FACTOR_REPEAT = 2;
    
    /**  Formfaktor quadratisch */
    public static final int FORM_FACTOR_SQUARE = 3;
    /**  Formfaktor rund */
    public static final int FORM_FACTOR_OVAL = 4;
    
    /** gibt an ob Feld sichtbar ist */
    private boolean visible = true;
    
    /** Hintergrundbild */
    private Image backgroundImage = null;
    
    /** Hintergrundbild Fuelfaktor. BACKGROUND_IMAGE_FILL_FACTOR_FILL oder BACKGROUND_IMAGE_FILL_FACTOR_ASPECT*/
    private int backgroundImageFillFactor = BACKGROUND_IMAGE_FILL_FACTOR_FILL;
    
    /** Icon */
    private Image iconImage = null;
    
    /** Hintergrundfarbe falls kein Hintergrundbild gesetzt ist */
    private Color backgroundColor = Color.WHITE;
    
    /** Farbe fuer Titel */
    private Color titleColor = Color.BLACK;
    
    /** Vergroesserungs / Verkleinerungsfaktor fuer Titel. Wert [-1, 1]*/
    private float titleScaleFactor = 0;
    
    /** Titel */
    private String title;

    /** Farbe fuer Subtext */
    private Color subtextColor = Color.BLACK;
    
    /** Vergroesserungs / Verkleinerungsfaktor fuer Subtext. Wert [-1, 1]*/
    private float subtextScaleFactor = 0;
    
    /** Rand IN PIXEL! */
    private float border = 1;
    
    /** Randfarbe */
    private Color borderColor = Color.BLACK;
    
    /** Subtext */
    private String subtext;
    
    /** Form des Feldes. FORM_FACTOR_SQUARE oder FORM_FACTOR_OVAL */
    private int formFactor = FORM_FACTOR_SQUARE;

    public Image getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(Image backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    public int getBackgroundImageFillFactor() {
        return backgroundImageFillFactor;
    }

    public void setBackgroundImageFillFactor(int backgroundImageFillFactor) {
        this.backgroundImageFillFactor = backgroundImageFillFactor;
    }

    public Image getIconImage() {
        return iconImage;
    }

    public void setIconImage(Image iconImage) {
        this.iconImage = iconImage;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public Color getTitleColor() {
        return titleColor;
    }

    public void setTitleColor(Color titleColor) {
        this.titleColor = titleColor;
    }

    public float getTitleScaleFactor() {
        return titleScaleFactor;
    }

    public void setTitleScaleFactor(float titleScaleFactor) {
        this.titleScaleFactor = titleScaleFactor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Color getSubtextColor() {
        return subtextColor;
    }

    public void setSubtextColor(Color subtextColor) {
        this.subtextColor = subtextColor;
    }

    public float getSubtextScaleFactor() {
        return subtextScaleFactor;
    }

    public void setSubtextScaleFactor(float subtextScaleFactor) {
        this.subtextScaleFactor = subtextScaleFactor;
    }

    public String getSubtext() {
        return subtext;
    }

    public void setSubtext(String subtext) {
        this.subtext = subtext;
    }

    public int getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(int formFactor) {
        this.formFactor = formFactor;
    }

    public Layout(String title, String subtext) {
        this.title = title;
        this.subtext = subtext;
    }

    public Layout() {
        this.title = "";
        this.subtext = "";
    }
    
    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public float getBorder() {
        return border;
    }

    public void setBorder(float border) {
        this.border = border;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }
    
    
}