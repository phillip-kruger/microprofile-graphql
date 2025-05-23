/*
 * Copyright (c) 2020 Contributors to the Eclipse Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.eclipse.microprofile.graphql;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Maps of the annotated Java enum to a GraphQL enum. <br>
 * <br>
 * For example, a user might annotate a enum as such:
 * 
 * <pre>
 * {@literal @}Enum("ClothingSize")
 * public enum ShirtSize {
 *       S,
 *       M,
 *       L,
 *       XL,
 *       XXL,
 *       HULK
 *   }
 * </pre>
 *
 * Schema generation of this would result in a stanza such as:
 * 
 * <pre>
 *   enum ClothingSize {
 *    HULK
 *    L
 *    M
 *    S
 *    XL
 *    XXL
 *  }
 * </pre>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
public @interface Enum {

    /**
     * @return the name of the GraphQL enum.
     */
    String value() default "";
}
