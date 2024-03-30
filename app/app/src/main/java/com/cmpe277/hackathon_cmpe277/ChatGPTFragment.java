package com.cmpe277.hackathon_cmpe277;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

//public class ChatGPTFragment extends Fragment {
//
//    private EditText chatInput;
//    private Button sendButton;
//    private TextView chatOutput;
//
//    public ChatGPTFragment() {
//        // Required empty public constructor
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        View rootView = inflater.inflate(R.layout.fragment_chatgpt, container, false);
//
//        // Initialize views
//        chatInput = rootView.findViewById(R.id.chat_input);
//        sendButton = rootView.findViewById(R.id.send_button);
//        chatOutput = rootView.findViewById(R.id.chat_output);
//
//        // Set click listener for the send button
//        sendButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Get the text from the input field
//                String question = chatInput.getText().toString().trim();
//                if (!question.isEmpty()) {
//                    // Call a method to process the question and get the response
//                    String response = generateResponse(question);
//                    // Display the response in the TextView
//                    displayResponse(response);
//                    // Clear the input field
//                    chatInput.getText().clear();
//                }
//            }
//        });
//
//        return rootView;
//    }
//
//    // Method to generate a response for the given question
//    private String generateResponse(String question) {
//        // Implement your logic here to generate a response based on the question
//        // For now, let's just echo the question as the response
//        return "You asked: " + question;
//    }
//
//    // Method to display the response in the TextView
//    private void displayResponse(String response) {
//        // Append the response to the existing text
//        chatOutput.append(response + "\n");
//        // Scroll to the bottom of the ScrollView to show the latest message
//        ScrollView scrollView = (ScrollView) chatOutput.getParent();
//        scrollView.fullScroll(View.FOCUS_DOWN);
//    }
//}
