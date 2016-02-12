/*
 * The MIT License
 *
 * Copyright 2016 Pawel Marynowski.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package pattypan;

import javafx.geometry.HPos;
import javafx.scene.layout.ColumnConstraints;

public final class Util {

  private Util() {
  }

  public static int WINDOW_WIDTH = 600;
  public static int WINDOW_HEIGHT = 400;

  public static ColumnConstraints newColumn(int value) {
    return newColumn(value, "%", HPos.CENTER);
  }
  
  public static ColumnConstraints newColumn(int value, String unit) {
    return newColumn(value, unit, HPos.CENTER);
  }
  
  public static ColumnConstraints newColumn(int value, String unit, HPos position) {
    ColumnConstraints col = new ColumnConstraints();
    if(unit.equals("%")) {
      col.setPercentWidth(value);
    }
    if(unit.equals("px")) {
      col.setMaxWidth(value);
      col.setMinWidth(value);
    }
    
    if(position != null) {
      col.setHalignment(position);
    }
    return col;
  }
}
