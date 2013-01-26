package de.jaschastarke.configuration;

import java.util.List;

public interface IConfiguration {
    /*public void setValues(ConfigurationSection sect);
    public ConfigurationSection getValues();*/
    public List<IConfigurationNode> getConfigNodes();
    public Object getValue(IConfigurationNode node);
}
