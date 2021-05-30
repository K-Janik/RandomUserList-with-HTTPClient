import { Injectable } from '@angular/core';
import {environment} from '../../../environments/environment';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {PersonInfo} from '../person-info/person-info';

@Injectable({
  providedIn: 'root'
})
export class PersonClientService {
  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient) {
  }

  public getPerson(): Observable<PersonInfo[]> {
    return this.http.get<PersonInfo[]>(`${this.apiServerUrl}/person-info`);
  }
}
