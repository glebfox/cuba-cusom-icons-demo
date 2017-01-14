package com.company.demo.web.fonts;

import com.vaadin.server.FontIcon;

/**
 * @author glebfox
 */
public enum IcoMoon implements FontIcon {

    HEADPHONES(0XE900),
    MUSIC(0XE901),
    FILE_MUSIC(0XE902),
    FILE_PLAY(0XE903),
    FILE_VIDEO(0XE904),
    SPINNER(0XE905),
    SPINNER2(0XE906),
    SPINNER3(0XE907),
    SPINNER6(0XE908),
    SPINNER7(0XE909),
    SPINNER8(0XE90A),
    SPINNER9(0XE90B),
    SPINNER10(0XE90C),
    SPINNER11(0XE90D),
    EQUALIZER(0XE90E),
    EQUALIZER2(0XE90F),
    COG(0XE910),
    COGS(0XE911),
    LIST(0XE912),
    LIST2(0XE913),
    MENU(0XE914),
    STAR_EMPTY(0XE915),
    STAR_HALF(0XE916),
    STAR_FULL(0XE917),
    HEART(0XE918),
    PLUS(0XE919),
    MINUS(0XE91A),
    INFO(0XE91B),
    CANCEL_CIRCLE(0XE91C),
    BLOCKED(0XE91D),
    PLAY2(0XE91E),
    PAUSE(0XE91F),
    STOP(0XE920),
    PREVIOUS(0XE921),
    NEXT(0XE922),
    BACKWARD(0XE923),
    FORWARD2(0XE924),
    PLAY3(0XE925),
    PAUSE2(0XE926),
    STOP2(0XE927),
    BACKWARD2(0XE928),
    FORWARD3(0XE929),
    FIRST(0XE92A),
    LAST(0XE92B),
    PREVIOUS2(0XE92C),
    NEXT2(0XE92D),
    EJECT(0XE92E),
    VOLUME_HIGH(0XE92F),
    VOLUME_MEDIUM(0XE930),
    VOLUME_LOW(0XE931),
    VOLUME_MUTE(0XE932),
    VOLUME_MUTE2(0XE933),
    VOLUME_INCREASE(0XE934),
    VOLUME_DECREASE(0XE935),
    LOOP(0XE936),
    LOOP2(0XE937),
    INFINITE(0XE938),
    SHUFFLE(0XE939),
    ;

    public static final String FONT_FAMILY = "IcoMoon";
    private int codepoint;

    IcoMoon(int codepoint) {
        this.codepoint = codepoint;
    }

    @Override
    public String getFontFamily() {
        return FONT_FAMILY;
    }

    @Override
    public int getCodepoint() {
        return codepoint;
    }

    @Override
    public String getHtml() {
        return "<span class=\"v-icon v-icon-" + name().toLowerCase()
                + "\" style=\"font-family: " + FONT_FAMILY + ";\">&#x"
                + Integer.toHexString(codepoint) + ";</span>";
    }

    @Override
    public String getMIMEType() {
        throw new UnsupportedOperationException(FontIcon.class.getSimpleName()
                + " should not be used where a MIME type is needed.");
    }

    public static IcoMoon fromCodepoint(final int codepoint) {
        for (IcoMoon f : values()) {
            if (f.getCodepoint() == codepoint) {
                return f;
            }
        }
        throw new IllegalArgumentException("Codepoint " + codepoint
                + " not found in IcoMoon");
    }
}
