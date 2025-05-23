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
 * Marks a class as a GraphQL Endpoint.
 * 
 * <br>
 * <br>
 * For example:
 * 
 * <pre>
 * {@literal @}GraphQLApi
 * {@literal @}RequestScoped
 * public class MembershipGraphQLApi {
 *     
 *     {@literal @}Inject
 *     private MembershipService membershipService;
 *     
 *     {@literal @}Query("memberships") 
 *     public List{@literal <}Membership{@literal >} getAllMemberships() {
 *         return getAllMemberships(Optional.empty());
 *     }
 * 
 *     // Other GraphQL queries and mutations
 * }
 * </pre>
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GraphQLApi {
}