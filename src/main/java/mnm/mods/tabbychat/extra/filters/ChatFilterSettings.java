package mnm.mods.tabbychat.extra.filters;

import java.util.HashSet;
import java.util.Set;

import mnm.mods.tabbychat.api.filters.FilterSettings;
import net.minecraft.util.text.TextFormatting;

/**
 * Defines the settings used by filters.
 */
public class ChatFilterSettings implements FilterSettings {

    // destinations
    private final Set<String> channels = new HashSet<String>();
    private boolean remove;
    private boolean isDestinationPm;
    // highlighting
    private boolean highlight = false;
    private TextFormatting color;
    private TextFormatting format;
    // notifications
    private boolean soundNotification = false;
    private String soundName = "";

    @Override
    public Set<String> getChannels() {
        return channels;
    }

    @Override
    public boolean isRemove() {
        return remove;
    }

    @Override
    public void setRemove(boolean value) {
        this.remove = value;
    }

    @Override
    public boolean isDestinationPm() {
        return isDestinationPm;
    }

    @Override
    public void setDestinationPm(boolean isDestinationPm) {
        this.isDestinationPm = isDestinationPm;
    }

    @Override
    public boolean isHighlight() {
        return highlight;
    }

    @Override
    public void setHighlight(boolean highlight) {
        this.highlight = highlight;
    }

    @Override
    public TextFormatting getColor() {
        return color;
    }

    @Override
    public void setColor(TextFormatting color) {
        if (color != null && !color.isColor()) {
            throw new IllegalArgumentException(color.getFriendlyName() + " is not a color.");
        }
        this.color = color;
    }

    @Override
    public TextFormatting getFormat() {
        return format;
    }

    @Override
    public void setFormat(TextFormatting format) {
        if (format != null && !format.isFancyStyling()) {
            throw new IllegalArgumentException(format.getFriendlyName() + " is not formatting.");
        }
        this.format = format;
    }

    @Override
    public boolean isSoundNotification() {
        return soundNotification;
    }

    @Override
    public void setSoundNotification(boolean sound) {
        this.soundNotification = sound;
    }

    @Override
    public String getSoundName() {
        return soundName;
    }

    @Override
    public void setSoundName(String soundName) {
        this.soundName = soundName;
    }
}
