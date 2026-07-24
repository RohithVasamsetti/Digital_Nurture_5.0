import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-course-card',
  standalone: true,
  imports: [],
  templateUrl: './course-card.html',
  styleUrl: './course-card.css'
})
export class CourseCard {

  @Input() courseName = '';
  @Input() instructor = '';
  @Input() duration = '';

  @Output()
  enroll = new EventEmitter<void>();

  enrollCourse() {
    this.enroll.emit();
  }
}