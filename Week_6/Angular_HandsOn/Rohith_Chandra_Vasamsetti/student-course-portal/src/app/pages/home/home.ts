import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CourseCard } from '../../components/course-card/course-card';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [
    FormsModule,
    CourseCard
  ],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home implements OnInit {

  studentName = 'Rohith';

  course = {
    name: 'Angular Development',
    instructor: 'John Smith',
    duration: '8 Weeks'
  };

  ngOnInit(): void {
    console.log('Home Component Initialized');
  }

  onEnroll() {
    alert('Successfully enrolled in Angular Development!');
  }
}