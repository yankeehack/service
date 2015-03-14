package backend;

import akka.actor.*;

/**
 * The settings for this application.
 */
public class Settings extends AbstractExtensionId<SettingsImpl>
        implements ExtensionIdProvider {
    public final static Settings SettingsProvider = new Settings();

    private Settings() {}

    public Settings lookup() {
        return Settings.SettingsProvider;
    }

    public SettingsImpl createExtension(ExtendedActorSystem system) {
        return new SettingsImpl(system.settings().config());
    }
}