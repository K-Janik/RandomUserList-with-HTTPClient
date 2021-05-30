import { Component, OnInit } from '@angular/core';
import {PersonInfo} from './person-info';
import {HttpErrorResponse} from '@angular/common/http';
import {PersonClientService} from '../services/person-client.service';

@Component({
  selector: 'app-person-info',
  templateUrl: './person-info.component.html',
  styleUrls: ['./person-info.component.css']
})
export class PersonInfoComponent implements OnInit {
  public persons: PersonInfo[];

  constructor(private personService: PersonClientService) { }

  // tslint:disable-next-line:typedef
  ngOnInit() {
    this.getPerson();
  }

  public getPerson(): void {
    this.personService.getPerson().subscribe(
      (response: PersonInfo[]) => {
        this.persons = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }
}
