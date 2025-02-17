/**
 * Shop API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { HttpHeaders }                                       from '@angular/common/http';

import { Observable }                                        from 'rxjs';

import { Analytics } from '../model/models';
import { EmailSent } from '../model/models';
import { Product } from '../model/models';


import { Configuration }                                     from '../configuration';



export interface ProductServiceInterface {
    defaultHeaders: HttpHeaders;
    configuration: Configuration;

    /**
     * 
     * 
     * @param name 
     */
    buyProduct(name: string, extraHttpRequestParams?: any): Observable<{}>;

    /**
     * 
     * 
     */
    getAllAnalytics(extraHttpRequestParams?: any): Observable<Array<Analytics>>;

    /**
     * 
     * 
     */
    getAllEmails(extraHttpRequestParams?: any): Observable<Array<EmailSent>>;

    /**
     * 
     * 
     */
    getAllProducts(extraHttpRequestParams?: any): Observable<Array<Product>>;

}
