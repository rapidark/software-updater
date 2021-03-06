// Copyright (c) 2012 Chan Wai Shing
//
// Permission is hereby granted, free of charge, to any person obtaining
// a copy of this software and associated documentation files (the
// "Software"), to deal in the Software without restriction, including
// without limitation the rights to use, copy, modify, merge, publish,
// distribute, sublicense, and/or sell copies of the Software, and to
// permit persons to whom the Software is furnished to do so, subject to
// the following conditions:
//
// The above copyright notice and this permission notice shall be
// included in all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
// EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
// MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
// NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
// LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
// OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
// WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
package updater.patch;

/**
 * Enum for specifying the operation type used by the patch.
 * @author Chan Wai Shing <cws1989@gmail.com>
 */
public enum OperationType {

  NEW("new"), FORCE("force"), REPLACE("replace"), PATCH("patch"), REMOVE("remove");
  /**
   * The string value representation of the operation type.
   */
  protected final String value;

  OperationType(String value) {
    this.value = value;
  }

  /**
   * Get the unique string representation for this operation type..
   * @return the string value
   */
  public String getValue() {
    return value;
  }

  /**
   * Get the {@link updater.patch.OperationType} by the types' string value.
   * @param value the string value
   * @return the {@link updater.patch.OperationType} or null if not 
   * correspondent found
   */
  public static OperationType get(String value) {
    OperationType[] operationTypes = OperationType.values();
    for (OperationType operationType : operationTypes) {
      if (operationType.getValue().equals(value)) {
        return operationType;
      }
    }
    return null;
  }
}
