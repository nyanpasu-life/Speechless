import React, { useState } from 'react';

interface CalendarData {
	[date: string]: string[];
}

const Calendar: React.FC = () => {
	// Initialize state for the calendar data
	const [calendarData, setCalendarData] = useState<CalendarData>({});

	// Function to add a job to a specific date
	const addJob = (date: string, job: string) => {
		setCalendarData((prevData) => ({
			...prevData,
			[date]: [...(prevData[date] || []), job],
		}));
	};

	return (
		<div>
			<h2>Calendar with Daily Jobs</h2>
			<div>
				{/* Loop through each date in the calendarData */}
				{Object.entries(calendarData).map(([date, jobs]) => (
					<div key={date}>
						<h3>{date}</h3>
						<ul>
							{/* Display each job for the specific date */}
							{jobs.map((job, index) => (
								<li key={index}>{job}</li>
							))}
						</ul>
					</div>
				))}
			</div>
			<div>
				{/* Example: Adding a job for a specific date */}
				<button onClick={() => addJob('2024-01-22', 'Meeting at 2 PM')}>
					Add Job on 2024-01-22
				</button>
				<button onClick={() => addJob('2024-01-23', 'Coding Challenge')}>
					Add Job on 2024-01-23
				</button>
			</div>
		</div>
	);
};

export default Calendar;
