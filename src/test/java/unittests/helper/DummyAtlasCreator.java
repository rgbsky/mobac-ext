/*******************************************************************************
 * Copyright (c) MOBAC developers
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package unittests.helper;


import mobac.exceptions.MapCreationException;
import mobac.program.atlascreators.AtlasCreator;
import mobac.program.interfaces.MapSource;

/**
 * A simple {@link AtlasCreator} implementation that does nothing. Can be used
 * in case only tile downloading and saving in the tile store is the test
 * target.
 */
public class DummyAtlasCreator extends AtlasCreator {

	public DummyAtlasCreator() {
	}

	@Override
	public void createMap() throws MapCreationException, InterruptedException {
	}

	@Override
	public boolean testMapSource(MapSource mapSource) {
		return true;
	}

}
