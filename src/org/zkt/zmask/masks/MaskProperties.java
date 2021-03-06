/*
 * MaskProperties.java
 * Copyright (C) 2010-2011  Jonas Eriksson
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.zkt.zmask.masks;

import org.zkt.zmask.utils.PropertyDescription;
import org.zkt.zmask.utils.PropertyContainer;

/**
 * Class for storing mask properties
 *
 * @author zqad
 */
public class MaskProperties implements PropertyContainer {
	private String key, name, description;
	private PropertyDescription[] properties;

	public MaskProperties(String key, String name, String description,
			PropertyDescription[] properties) {
		this.key = key;
		this.name = name;
		this.description = description;
		this.properties	= properties;
	}

	public String getKey() {
		return key;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public PropertyDescription[] getProperties() {
		return properties;
	}
}
