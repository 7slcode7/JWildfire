/*
  JWildfire - an image and animation processor written in Java 
  Copyright (C) 1995-2013 Andreas Maschke

  This is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser 
  General Public License as published by the Free Software Foundation; either version 2.1 of the 
  License, or (at your option) any later version.
 
  This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without 
  even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
  Lesser General Public License for more details.

  You should have received a copy of the GNU Lesser General Public License along with this software; 
  if not, write to the Free Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
  02110-1301 USA, or see the FSF site: http://www.fsf.org.
*/
package org.jwildfire.create.tina.mutagen;

import org.jwildfire.create.tina.base.Flame;

public class ChangeWeightMutation implements Mutation {

  @Override
  public void execute(Flame pFlame) {
    int idx = (int) Math.random() * pFlame.getXForms().size();
    double oldWeight = pFlame.getXForms().get(idx).getWeight();
    double newWeight = oldWeight + (0.5 - Math.random()) * (1 + 10.0 * Math.random());
    pFlame.getXForms().get(idx).setWeight(newWeight);
  }

}
