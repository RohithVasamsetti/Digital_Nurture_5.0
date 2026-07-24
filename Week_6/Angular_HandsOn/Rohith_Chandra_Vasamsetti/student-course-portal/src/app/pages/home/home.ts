import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CourseCard } from '../../components/course-card/course-card';
import { CommonModule } from '@angular/common';
@Component({
  selector: 'app-home',
  standalone: true,
  imports: [
    CommonModule,
    FormsModule,
    CourseCard
  ],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home implements OnInit {

  studentName = 'Rohith';

  courses = [
  {
    name: 'Angular Development',
    instructor: 'John Smith',
    duration: '8 Weeks',
    fee: 4999,
    startDate: new Date('2026-08-01'),
    category: 'Frontend',
    available: true
  },
  {
    name: 'Java Programming',
    instructor: 'David Miller',
    duration: '10 Weeks',
    fee: 5999,
    startDate: new Date('2026-08-10'),
    category: 'Backend',
    available: false
  },
  {
    name: 'Python for AI',
    instructor: 'Emma Wilson',
    duration: '12 Weeks',
    fee: 6999,
    startDate: new Date('2026-09-01'),
    category: 'AI',
    available: true
  }
];

  ngOnInit(): void {
    console.log('Home Component Initialized');
  }

  onEnroll() {
    alert('Successfully enrolled in Angular Development!');
  }
}