import { Component, EventEmitter, Input, Output } from '@angular/core';
import { CommonModule } from '@angular/common';
@Component({
  selector: 'app-course-card',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './course-card.html',
  styleUrl: './course-card.css'
})
export class CourseCard {

  @Input() courseName = '';
  @Input() instructor = '';
  @Input() duration = '';
  @Input() fee = 0;
  @Input() startDate!: Date;
  @Input() category = '';
  @Input() available = true;

  @Output()
  enroll = new EventEmitter<string>();

  enrollCourse() {
    this.enroll.emit(this.courseName);
  }
}